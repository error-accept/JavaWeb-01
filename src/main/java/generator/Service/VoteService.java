package generator.Service;

import generator.Util.SqlUtil;
import generator.domain.TVote;
import generator.mapper.TVoteMapper;

import java.util.Date;
import java.util.List;

public class VoteService {
    private TVoteMapper TVoteMapper;

    public VoteService() {
        this.TVoteMapper = SqlUtil.getTVoteMapper();
    }

    public Date getLastTime(Integer Id){
        return TVoteMapper.getTimeByUser(Id);

    }
    public boolean canVote(int userId, Date currentTime) {
        return true;
//        Date lastTime = getLastTime(userId) ;
//        if (lastTime == null) return true ;
//        System.out.println(currentTime.getTime()) ;
//        System.out.println(lastTime.getTime() ) ;
//        System.out.println(currentTime.getTime() - lastTime.getTime()) ;
//        return currentTime.getTime() - getLastTime(userId).getTime() > 1000 * 60 * 60 * 24 ;
    }
    public int insertVote(TVote vote){
        return TVoteMapper.insert(vote);
    }
    public  int banVote(Integer id){
        return TVoteMapper.updateById(id);
    }

    public List<TVote> getall() {
        return TVoteMapper.getall();
    }
}
