package edu.icet.demo.service.Impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.demo.dto.HardwareItem;
import edu.icet.demo.entity.HardwareItemEntity;
import edu.icet.demo.repository.HardwareItemRepository;
import edu.icet.demo.service.HardwareItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HardwareItemServiceImpl implements HardwareItemService {

    private final HardwareItemRepository hardwareItemRepository;
    private final ObjectMapper mapper;

    @Override
    public void saveHardwareItem(HardwareItem hardwareItem) {
        HardwareItemEntity studentEntity = mapper.convertValue(hardwareItem, HardwareItemEntity.class);
        hardwareItemRepository.save(studentEntity);
    }

    @Override
    public List<HardwareItem> getAllHardwareItem() {

        List<HardwareItem> hardwareItemList = new ArrayList();
        Iterable<HardwareItemEntity> all = hardwareItemRepository.findAll();

        all.forEach(studentEntity -> {
            HardwareItem hardwareItem = mapper.convertValue(studentEntity, HardwareItem.class);
            hardwareItemList.add(hardwareItem);
        });
        return hardwareItemList;
    }

    @Override
    public HardwareItem getAllHardwareItemById(Integer itemId) {

        if(hardwareItemRepository.existsById(itemId)){
            Optional<HardwareItemEntity> byId = hardwareItemRepository.findById(itemId);
            return mapper.convertValue(byId, HardwareItem.class);
        }
        return null;
    }

    @Override
    public boolean deleteHardware(Integer itemId) {
        if(hardwareItemRepository.existsById(itemId)){
            hardwareItemRepository.deleteById(itemId);
            return true;
        }
        return false;
    }

    @Override
    public void upadateHardware(HardwareItemService hardwareItemService) {

    }


}
