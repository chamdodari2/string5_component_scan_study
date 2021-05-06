package string5_component_scan_study.spring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
@Component  //이래넣어주면
public class MemberDao {
	
	public static long nextId= 0;
	public Map<String,Member> map = new HashMap<>();
	
	
	
	public Member selectByEmail(String email) {
		return map.get(email);
	}
	
	public void insert(Member member) {
		member.setId(++nextId);
		map.put(member.getEmail(), member);
	}
	
	public void update(Member member) {
		map.put(member.getEmail(), member);
	}

	
	
	public Collection<Member> selectAll(){  //멤버만 컬렉션안에 들어가있는거
		return map.values();
	}
	
	
	

}
