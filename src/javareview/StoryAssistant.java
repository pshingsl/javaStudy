package javareview;

import javareview.util.DateUtil;

import java.util.UUID;

public class StoryAssistant {
    public static void main(String[] args) {
        TravelClub travelClub = new TravelClub("jejuclub", "jeju Travle club");
        System.out.println(travelClub.toString());
    }
}

class TravelClub {
    private static final int MINIMUM_NAME_LENGTH = 3;
    private static final int MINIMUM_INTRO_LENGTH = 10;

    private String id;
    private String clubName;
    private String intro;
    private String foundatinDay;

    private TravelClub() {
        this.id = UUID.randomUUID().toString();
    }

    public TravelClub(String clubName, String intro) {
        this.clubName = clubName;
        this.intro = intro;
        this.foundatinDay = DateUtil.today();
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        if (clubName.length() < MINIMUM_NAME_LENGTH) {
            System.out.println("이름은 3글자 넘게 작성해주세요.");
            return;
        }
        this.clubName = clubName;
    }

    public String getIntro() {
        return this.intro;
    }

    public void setIntro(String intro) {
        if(intro.length() < MINIMUM_INTRO_LENGTH){
            System.out.println("소개는 10글자 이상 해주세요");
            return;
        }
        this.intro = intro;
    }

    public String getFoundatinDay() {
        return foundatinDay;
    }

    public static  TravelClub getSample() {
        String clubName = "sample clubName";
        String intro = "sample intro";
        TravelClub travelClub = new TravelClub(clubName, intro);
        return travelClub;

       // return new TravelClub("sample clubName", "sample intro"); 로 가능
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("travle id : ").append(id);
        builder.append(", clubName :").append(clubName);
        builder.append(", intro : ").append(intro);
        builder.append(", foundatinDay : ").append(foundatinDay);

        return builder.toString();
    }
}
