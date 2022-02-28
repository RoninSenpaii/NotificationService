package me.ronin.ns.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "player", url = "https://v3.football.api-sports.io")
public interface PlayerClient {
    @RequestMapping(value = "/players?id=277&season=2019", method = RequestMethod.GET)
    public ResponseEntity<?> fetchPlayer();
}
