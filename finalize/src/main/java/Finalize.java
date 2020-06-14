public class Finalize implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("called close method");
    }
}
