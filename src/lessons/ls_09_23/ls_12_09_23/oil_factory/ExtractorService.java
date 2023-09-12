package lessons.ls_09_23.ls_12_09_23.oil_factory;

import java.util.ArrayList;
import java.util.List;

public class ExtractorService {
    private List<Extractor> extractors;

    public ExtractorService() {
        extractors = new ArrayList<>();
    }

    public long showExtractorsWithError() {
        return extractors
                .stream()
                .filter(extractor -> extractor.getStatus() == Status.ERROR)
                .count();

    }

    public long countGoodExtractors() {
        return extractors
                .stream()
                .filter(extractor -> extractor.getActualCapacity() > 95)
                .count();
    }
}
