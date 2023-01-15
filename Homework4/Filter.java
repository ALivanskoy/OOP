import java.util.Collection;
import java.util.Iterator;

// public class Filter<T extends Collection<A>> { Collection is a raw type, почему не даёт привести к определённому типу?
public class Filter<T1 extends Collection<T2>, T2> {

    T1 inputCollection;
    T1 approveCollection;
    IsGood<T2> approver;

    public Filter(T1 inputCollection, T1 approveCollection, IsGood<T2> approver) {
        this.inputCollection = inputCollection;
        this.approveCollection = approveCollection;
        this.approver = approver;
    }

    public void filter() {

        Iterator<T2> colIterator = inputCollection.iterator();

        while (colIterator.hasNext()) {
            T2 thing = colIterator.next();
            if (approver.IsGood(thing))
                approveCollection.add(thing);
        }
    }

    public T1 getApproveCollection() {
        return approveCollection;
    }

}
