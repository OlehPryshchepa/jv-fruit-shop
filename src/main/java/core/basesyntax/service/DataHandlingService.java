package core.basesyntax.service;

import core.basesyntax.model.FruitTransaction;
import java.util.List;

public interface DataHandlingService {
    void process(List<FruitTransaction> data);
}
