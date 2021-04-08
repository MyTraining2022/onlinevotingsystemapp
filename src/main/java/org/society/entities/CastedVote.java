package org.society.entities;

import java.io.Serializable;
import java.util.Map;
/*
 * @author Shobhit Kumar Shaw
 * 
 * Class Description: 
 *
 * 
 */


public class CastedVote implements Serializable {
	
	
	private static final long serialVersionUID = 3L;
	private Map<NominatedCandidates, Integer> castedVotes;
	
	public CastedVote() {
		super();
	}
	public Map<NominatedCandidates, Integer> getCastedVotes() {
		return castedVotes;
	}
	public void setCastedVotes(Map<NominatedCandidates, Integer> castedVotes) {
		this.castedVotes = castedVotes;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
 
}
