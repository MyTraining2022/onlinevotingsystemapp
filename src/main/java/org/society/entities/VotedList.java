
package org.society.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

/*
 * @author: Aditya Mohapatra
 */

@Entity
@Table(name = "Voted_list")
public class VotedList implements Serializable {
	private static final long serialVersionUID = 856L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Voter_id")
	private long id;

	@Basic
	private LocalDate pollingDateTime;
	
	
	@OneToOne
	@JoinColumn(name = "society_id")
	private CooperativeSociety society; // no list
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Voter_id")
	private List<RegisteredSocietyVoters> voter;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Voter_id")
	private List<NominatedCandidates> candidate;

	//
	@Basic
	private LocalTime startTime;
	@Basic
	private LocalTime endTime;

	public VotedList() {
		super();
	}

	public VotedList(long id, LocalDate pollingDateTime, CooperativeSociety society,
			List<RegisteredSocietyVoters> voter, List<NominatedCandidates> candidate, LocalTime startTime,
			LocalTime endTime) {
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

	public LocalDate getPollingDateTime() {
		return pollingDateTime;
	}

	public void setPollingDateTime(LocalDate pollingDateTime) {
		this.pollingDateTime = pollingDateTime;
	}

	public CooperativeSociety getSociety() {
		return society;
	}

	public void setSociety(CooperativeSociety society) {
		this.society = society;
	}

	public List<RegisteredSocietyVoters> getVoter() {
		return voter;
	}

	public void setVoter(List<RegisteredSocietyVoters> voter) {
		this.voter = voter;
	}

	public List<NominatedCandidates> getCandidate() {
		return candidate;
	}

	public void setCandidate(List<NominatedCandidates> candidate) {
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

	@Override
	public String toString() {
		return "VotedList [id=" + id + ", pollingDateTime=" + pollingDateTime + ", society=" + society + ", voter="
				+ voter + ", candidate=" + candidate + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	
	

}