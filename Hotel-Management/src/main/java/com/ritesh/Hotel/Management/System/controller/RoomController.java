package com.ritesh.Hotel.Management.System.controller;

import com.ritesh.Hotel.Management.System.model.HotelRoom;
import com.ritesh.Hotel.Management.System.model.Type;
import com.ritesh.Hotel.Management.System.service.RoomService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RoomController {
    @Autowired
    RoomService roomService;

    // add a single room
    @PostMapping("room")
    public String addRoom(@RequestBody HotelRoom room){
        return roomService.addRoom(room);
    }

    // add multiple rooms
    @PostMapping("rooms")
    public String addRooms(@RequestBody List<HotelRoom> rooms){
        return roomService.addRooms(rooms);
    }

    // get room by id
    @GetMapping("room/{id}")
    public Optional<HotelRoom> getRoomById(@PathVariable Integer id){
        return roomService.getRoomById(id);
    }

    // get multiple room by multiple ids
    @GetMapping("rooms/list/{ids}")
    public Iterable<HotelRoom> getAllRoomsById(@PathVariable List<Integer> ids){
        return roomService.getAllRoomsById(ids);
    }

    //get all rooms
    @GetMapping("rooms")
    public Iterable<HotelRoom> getAllRooms(){
        return roomService.getAllRooms();
    }

    // get number of rooms
    @GetMapping("room/total")
    public long getNoOfRooms(){
        return roomService.getNoOfRooms();
    }

    // check room is exists or not
    @GetMapping("room/{id}/exits")
    public boolean roomExistsOrNot(@PathVariable Integer id){
        return roomService.roomExistsOrNot(id);
    }

    // find by room status
    @GetMapping("room/status/{status}")
    public List<HotelRoom> getRoomByStatus(@PathVariable Boolean status){
        return roomService.getRoomByStatus(status);
    }

    // delete room by id
    @DeleteMapping("room/{id}")
    public String deleteRoomById(@PathVariable Integer id){
        return roomService.deleteRoomById(id);
    }

    // delete all rooms of database
    @DeleteMapping("rooms")
    public String deleteAllRooms(){
        return roomService.deleteAllRooms();
    }

    //update room Type by id
    @PutMapping("room/{id}/{type}")
    public String UpdateRoomTypeById(@PathVariable Integer id, @PathVariable Type type){
        return roomService.UpdateRoomTypeById(id, type);
    }


}
