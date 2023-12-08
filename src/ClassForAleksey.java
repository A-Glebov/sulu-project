import java.util.Objects;

public class ClassForAleksey {
    private String hello;

    public ClassForAleksey(String hello) {
        this.hello = hello;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassForAleksey that = (ClassForAleksey) o;
        return Objects.equals(hello, that.hello);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hello);
    }
}
