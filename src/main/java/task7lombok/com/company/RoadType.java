package task7lombok.com.company;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public enum RoadType {
    //реализовать виды дорожного покрытия
    asphalt, gravel, sand, soil
}
