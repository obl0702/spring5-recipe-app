package com.ongbl.services;

import com.ongbl.commands.UnitOfMeasureCommand;
import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}