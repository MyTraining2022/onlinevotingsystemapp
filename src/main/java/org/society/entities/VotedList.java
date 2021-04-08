/*
 * @author: Aditya Mohapatra
 */

package org.society.entities;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn; 

@Entity
@Table(name = "Voter_list")
public class VotedList implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "Voter_id")
	private long id;
	
	private Date pollingDateTime;
	
	@ManyToMany(cascade=CascadeType.ALL) 
	@JoinTable(name = "Voter_list_Cooperative_Society", joinColumns = { @JoinColumn(name = "Voter_id") }, inverseJoinColumns = { @JoinColumn(name = "society_id") })
	private Set<CooperativeSociety> society;
	@ManyToMany(cascade=CascadeType.ALL) 
	@JoinTable(name="Voter_list_Registered_Society_Voters", joinColumns=@JoinColumn(name="Voter_id"), inverseJoinColumns=@JoinColumn(name="author_id")) 
	private Set<RegisteredSocietyVoters> voter;
	@ManyToMany(cascade=CascadeType.ALL) 
	@JoinTable(name="Voter_list_Nominated_Candidates", joinColumns=@JoinColumn(name="Voter_id"), inverseJoinColumns=@JoinColumn(name= "candidate_id")) 
	private Set<NominatedCandidates> candidate;
	
	private LocalTime startTime;
	private LocalTime endTime;
	
	public VotedList() {
		super();
	}

	
	public VotedList(long id, Date pollingDateTime, Set<CooperativeSociety> society, Set<RegisteredSocietyVoters> voter,
			Set<NominatedCandidates> candidate, LocalTime startTime, LocalTime endTime) {
		super();
		this.id = id;
		this.pollingDateTime = pollingDateTime;
		this.society = society;
		this.voter = voter;
		this.candidate = candidate;
		this.startTime = startTime;
		this.endTime = endTime;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getPollingDateTime() {
		return pollingDateTime;
	}

	public void setPollingDateTime(Date pollingDateTime) {
		this.pollingDateTime = pollingDateTime;
	}

	public Set<CooperativeSociety> getSociety() {
		return society;
	}

	public void setSociety(Set<CooperativeSociety> society) {
		this.society = society;
	}

	public Set<RegisteredSocietyVoters> getVoter() {
		return voter;
	}

	public void setVoter(Set<RegisteredSocietyVoters> voter) {
		this.voter = voter;
	}

	public Set<NominatedCandidates> getCandidate() {
		return candidate;
	}

	public void setCandidate(Set<NominatedCandidates> candidate) {
		this.candidate = candidate;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "VotedList [id=" + id + ", pollingDateTime=" + pollingDateTime + ", society=" + society + ", voter="
				+ voter + ", candidate=" + candidate + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	
	
}