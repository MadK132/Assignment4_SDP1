public class Document {
    private String content;

    public void write(String content) {
        this.content = content;
    }

    public String read() {
        return content;
    }

    public DocumentVersion save() {
        return new DocumentVersion(content);
    }

    public void restore(DocumentVersion memento) {
        content = memento.getContent();
    }
}
