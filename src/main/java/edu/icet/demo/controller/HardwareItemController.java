package edu.icet.demo.controller;

import edu.icet.demo.dto.HardwareItem;
import edu.icet.demo.service.HardwareItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin
@RequestMapping("/hardware")
public class HardwareItemController {

    private  final HardwareItemService hardwareItemService;
    @PostMapping("/save-hardware")
    void savehardware(@RequestBody HardwareItem hardware){
        hardwareItemService.saveHardwareItem(hardware);
    }

    @GetMapping("/get-hardware")
    List<HardwareItem> getAllHardwareItem() {
        return hardwareItemService.getAllHardwareItem();
    }



    @DeleteMapping("/delete-hardware/{ItemId}")
    boolean deletehardware(@PathVariable Integer ItemId){
        return hardwareItemService.deleteHardware(ItemId);
    }

    @GetMapping("/find-by-ItemId/{ItemId}")
    public HardwareItem findbyItemId(@PathVariable Integer ItemId){
        return hardwareItemService.getAllHardwareItemById(ItemId);
    }


}
