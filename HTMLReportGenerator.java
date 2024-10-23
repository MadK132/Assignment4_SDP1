public class HTMLReportGenerator extends ReportGenerator {
    @Override
    protected void formatHeader() {
        System.out.println("<html><head>HTML Report: Header</head>");
    }

    @Override
    protected void formatBody() {
        System.out.println("<body>HTML Report: Body</body>");
    }

    @Override
    protected void formatFooter() {
        System.out.println("<footer>HTML Report: Footer</footer></html>");
    }
}
