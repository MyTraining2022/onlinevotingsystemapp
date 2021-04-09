package org.society.entities;

import java.io.Serializable;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKeyColumn;
import javax.persistence.JoinColumn;
/*
 * @author Shobhit Kumar Shaw
 * 
 * Class Description: Casting of voting done here.
 *
 * 
 */

@Entity
public class CastedVote implements Serializable {

	private static final long serialVersionUID = 3L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@ElementCollection
	@CollectionTable(name = "nominated_candidates_casted_voter_mapping", joinColumns = {
			@JoinColumn(name = "castd_vote_id", referencedColumnName = "id") })
	@MapKeyColumn(name = "Nominated_Candidates")
	@Column(name = "total_votes")
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
