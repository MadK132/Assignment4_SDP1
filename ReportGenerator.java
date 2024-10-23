public abstract class ReportGenerator {
    public void generateReport() {
        formatHeader();
        formatBody();
        formatFooter();
        System.out.println("Report generation complete.\n");
    }

    protected abstract void formatHeader();
    protected abstract void formatBody();
    protected abstract void formatFooter();
}
