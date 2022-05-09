package clase_prototype;

public interface MijlocTransport extends Cloneable {
    MijlocTransport copiaza() throws CloneNotSupportedException;
}
