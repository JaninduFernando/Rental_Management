package edu.icet.demo.service;

import edu.icet.demo.dto.HardwareItem;

import java.util.List;

public interface HardwareItemService {
    void saveHardwareItem(HardwareItem hardwareItem);

    List<HardwareItem> getAllHardwareItem();

    HardwareItem getAllHardwareItemById(Integer itemId);

    boolean deleteHardware(Integer itemId);

    void upadateHardware(HardwareItemService hardwareItemService);
}
