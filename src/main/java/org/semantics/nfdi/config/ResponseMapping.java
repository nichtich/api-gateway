package org.semantics.nfdi.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseMapping {
    private String nestedJson;
    private String iri;
    private String label;
    private String source;
    private String synonym;
    private String ontology;

    public List<String> getFieldList() {
        return Arrays.asList(iri, label, source, synonym, ontology);
    }
}