import java.util.ArrayList;
import java.util.List;

public class VersionControl {
    private List<DocumentVersion> versions = new ArrayList<>();

    public void saveVersion(DocumentVersion version) {
        versions.add(version);
    }

    public DocumentVersion getVersion(int index) {
        if (index < versions.size()) {
            return versions.get(index);
        }
        return null;
    }
}
