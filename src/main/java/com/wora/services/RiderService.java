package com.wora.services;


import com.wora.models.dto.RiderDTO;

import java.util.List;

public interface RiderService {
    RiderDTO createRider(RiderDTO riderDTO);
    RiderDTO updateRider(Long id, RiderDTO riderDTO);
    void deleteRider(Long id);
    List<RiderDTO> getRiders();
}
