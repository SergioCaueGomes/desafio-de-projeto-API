package one.digitalinovation.gof.singleton;

/**
 * Singleton "Lazy Holder".
 *
 * @see <a href="http://stackoverflow.com/a/24018148"></a>
 *
 * @author Sergio
 * */
public class SingletonLazyHolder {
    private static class InstanceHolder {
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() { super(); }
    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
