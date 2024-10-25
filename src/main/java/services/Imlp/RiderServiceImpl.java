package services.Imlp;

import models.dto.ResultDTO;
import models.dto.RiderDTO;
import models.entities.Result;
import models.entities.Rider;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.RiderRepo;
import services.RiderService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RiderServiceImpl implements RiderService {

    @Autowired
    private RiderRepo riderRepo;
    @Autowired
    private final ModelMapper modelMapper;

    public RiderServiceImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public RiderDTO createRider(RiderDTO riderDTO) {
        Rider rider = modelMapper.map(riderDTO, Rider.class);
        rider = riderRepo.save(rider);
        return modelMapper.map(rider, RiderDTO.class);
    }
    public RiderDTO updateRider(Long id, RiderDTO riderDTO) {
        Rider rider = riderRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Rider not found"));
        modelMapper.map(riderDTO, rider);
        Rider savedRider = riderRepo.save(rider);
        return modelMapper.map(savedRider, RiderDTO.class);
    }
    public void deleteRider(Long id) {
        Rider rider = riderRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Rider not found"));
        riderRepo.delete(rider);
    }
    public List<RiderDTO> getRiders() {
        List<Rider> riders = riderRepo.findAll();
        return riders.stream()
                .map(rider -> modelMapper.map(rider,RiderDTO.class)).collect(Collectors.toList());
    }
}
