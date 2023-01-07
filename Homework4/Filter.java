import java.util.Collection;
import java.util.Iterator;

// public class Filter<T extends Collection<A>> { Collection is a raw type, почему не даёт привести к определённому типу?
public class Filter<T extends Collection> {

    T inputCollection;
    T approveCollection;
    IsGood approver;

    public Filter(T inputCollection, T approveCollection, IsGood approver) {
        this.inputCollection = inputCollection;
        this.approveCollection = approveCollection;
        this.approver = approver;
    }

    public void filter() {

        Iterator colIterator = inputCollection.iterator();

        while (colIterator.hasNext()) {
            var thing = colIterator.next();
            if (approver.IsGood(thing))
                approveCollection.add(thing);
        }
    }

    public T getApproveCollection() {
        return approveCollection;
    }

}
