
public class Unlocker<T> {

    // Выбор режима, геттеры и сеттеры не нужны, поскольку все изменения вносятся
    // только посредством создания нового Unlocker'а в клиентском коде
    // Логика проверки осуществляется непосредственно классами Pin/Fingerprint/FaceID

    private Unlock<T> unlocker;

    public Unlocker(Unlock<T> unlocker) {
        this.unlocker = unlocker;
    }

    public boolean isUnlock(T password) {


        return unlocker.checkUnlock(password);

    }

}