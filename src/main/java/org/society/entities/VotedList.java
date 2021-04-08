/*
 * @author: Aditya Mohapatra
 */

package org.society.entities;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class VotedList implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	private Date pollingDateTime;
	
	@ManyToMany(cascade=CascadeType.ALL) 
	//@JoinTable(name="author_book", joinColumns=@JoinColumn(name="book_id"), inverseJoinColumns=@JoinColumn(name="author_id")) 
	private CooperativeSociety society;
	@OneToMany(cascade=CascadeType.ALL) 
	//@JoinTable(name="author_book", joinColumns=@JoinColumn(name="book_id"), inverseJoinColumns=@JoinColumn(name="author_id")) 
	private RegisteredSocietyVoters voter;
	@OneToMany(cascade=CascadeType.ALL) 
	//@JoinTable(name="author_book", joinColumns=@JoinColumn(name="book_id"), inverseJoinColumns=@JoinColumn(name="author_id")) 
	private NominatedCandidates candidate;
	
	private LocalTime startTime;
	private LocalTime endTime;
	
	public VotedList() {
		super();
	}
	
	public VotedList(long id, Date pollingDateTime, CooperativeSociety society, RegisteredSocietyVoters voter,
			NominatedCandidates candidate, LocalTime startTime, LocalTime endTime) {
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
	public CooperativeSociety getSociety() {
		return society;
	}
	public void setSociety(CooperativeSociety society) {
		this.society = society;
	}
	public RegisteredSocietyVoters getVoter() {
		return voter;
	}
	public void setVoter(RegisteredSocietyVoters voter) {
		this.voter = voter;
	}
	public NominatedCandidates getCandidate() {
		return candidate;
	}
	public void setCandidate(NominatedCandidates candidate) {
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