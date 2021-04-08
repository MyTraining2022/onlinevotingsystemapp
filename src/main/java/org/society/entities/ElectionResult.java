package org.society.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;



@Entity
public class ElectionResult implements Serializable{
	
	
	
	private static final long serialVersionUID = 123456789L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Temporal(value=TemporalType.DATE)
	private Date pollingDate;
	 //@OneToMany(mappedBy =                cascade=CascadeType.ALL)
	// @JoinTable(name="author_book", joinColumns=@JoinColumn(name="book_id"),
	// inverseJoinColumns=@JoinColumn(name="author_id"))
	//private Set<NominatedCandidates> candidate;
	private NominatedCandidates candidate;
	private String cooperativeSocietyName;
	private int totalSocietyVotes;
	private int totalPolledVotes;
	private float totalPollingPercentage;
	private int totalCandidateVotes;
	private float candidateVotesPercentage;
	@NotNull(message = "Result should be should")
	private String result;
//Look for map mapping in jpa
	private CastedVote votes;

	public ElectionResult() {
		super();
	}

	public ElectionResult(long id, Date pollingDate, NominatedCandidates candidate, String coop_SocietyName,
			int totalSocietyVotes, int totalPolledVotes, float totalPollingPercentage, int totalCandidateVotes,
			float candidateVotesPercentage, String result, CastedVote votes) {
		super();
		this.id = id;
		this.pollingDate = pollingDate;
		this.candidate = candidate;
		this.cooperativeSocietyName = coop_SocietyName;
		this.totalSocietyVotes = totalSocietyVotes;
		this.totalPolledVotes = totalPolledVotes;
		this.totalPollingPercentage = totalPollingPercentage;
		this.totalCandidateVotes = totalCandidateVotes;
		this.candidateVotesPercentage = candidateVotesPercentage;
		this.result = result;
		this.votes = votes;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getPollingDate() {
		return pollingDate;
	}

	public void setPollingDate(Date pollingDate) {
		this.pollingDate = pollingDate;
	}

	public NominatedCandidates getCandidate() {
		return candidate;
	}

	public void setCandidate(NominatedCandidates candidate) {
		this.candidate = candidate;
	}

	public String getCooperativeSocietyName() {
		return cooperativeSocietyName;
	}

	public void setCoop_SocietyName(String cooperativeSocietyName) {
		this.cooperativeSocietyName = cooperativeSocietyName;
	}

	public int getTotalSocietyVotes() {
		return totalSocietyVotes;
	}

	public void setTotalSocietyVotes(int totalSocietyVotes) {
		this.totalSocietyVotes = totalSocietyVotes;
	}

	public int getTotalPolledVotes() {
		return totalPolledVotes;
	}

	public void setTotalPolledVotes(int totalPolledVotes) {
		this.totalPolledVotes = totalPolledVotes;
	}

	public float getTotalPollingPercentage() {
		return totalPollingPercentage;
	}

	public void setTotalPollingPercentage(float totalPollingPercentage) {
		this.totalPollingPercentage = totalPollingPercentage;
	}

	public int getTotalCandidateVotes() {
		return totalCandidateVotes;
	}

	public void setTotalCandidateVotes(int totalCandidateVotes) {
		this.totalCandidateVotes = totalCandidateVotes;
	}

	public float getCandidateVotesPercentage() {
		return candidateVotesPercentage;
	}

	public void setCandidateVotesPercentage(float candidateVotesPercentage) {
		this.candidateVotesPercentage = candidateVotesPercentage;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public CastedVote getVotes() {
		return votes;
	}

	public void setVotes(CastedVote votes) {
		this.votes = votes;
	}

	@Override
	public String toString() {
		return "ElectionResult [id=" + id + ", pollingDate=" + pollingDate + ", candidate=" + candidate
				+ ", coop_SocietyName=" + cooperativeSocietyName + ", totalSocietyVotes=" + totalSocietyVotes
				+ ", totalPolledVotes=" + totalPolledVotes + ", totalPollingPercentage=" + totalPollingPercentage
				+ ", totalCandidateVotes=" + totalCandidateVotes + ", candidateVotesPercentage="
				+ candidateVotesPercentage + ", result=" + result + "]";
	}

}
