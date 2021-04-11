/*
 * @author- Govind Kidambi
 * 
 * This is Nominated Candidates File
 */

package org.society.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Nominated_Candidates")
public class NominatedCandidates implements Serializable {
	
	private static final long serialVersionUID = 99L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long candidateId;
	//add unique constraint here
	private String nominationFormNo;
	
	private String partyName;
	private String symbol;
	private float securityDeposit;
    private boolean oathOrAffirmationSummited;
    private boolean policeVerificationDone;
    private boolean approvedByElectionOfficer;
    
    @OneToOne(mappedBy = "nominatedCandidates") 
    private RegisteredSocietyVoters registeredSocietyVoter;
    
    @OneToOne(mappedBy = "nominatedCandidates")
    private VotedList votedList;
    
    //@ManyToOne
   // @JoinColumn(name = "election_result_fk")
    @OneToOne(mappedBy = "nominatedCandidates")
    private ElectionResult electionResult;
	
    public NominatedCandidates() {
		super();
	}
    
    

	public NominatedCandidates(long candidateId, String nominationFormNo, String partyName, String symbol,
			float securityDeposit, boolean oathOrAffirmationSummited, boolean policeVerificationDone,
			boolean approvedByElectionOfficer, RegisteredSocietyVoters registeredSocietyVoter, VotedList votedList,
			ElectionResult electionResult) {
		super();
		this.candidateId = candidateId;
		this.nominationFormNo = nominationFormNo;
		this.partyName = partyName;
		this.symbol = symbol;
		this.securityDeposit = securityDeposit;
		this.oathOrAffirmationSummited = oathOrAffirmationSummited;
		this.policeVerificationDone = policeVerificationDone;
		this.approvedByElectionOfficer = approvedByElectionOfficer;
		this.registeredSocietyVoter = registeredSocietyVoter;
		this.votedList = votedList;
		this.electionResult = electionResult;
	}



	public VotedList getVotedList() {
		return votedList;
	}



	public void setVotedList(VotedList votedList) {
		this.votedList = votedList;
	}



	public long getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(long candidateId) {
		this.candidateId = candidateId;
	}

	public String getNominationFormNo() {
		return nominationFormNo;
	}

	public void setNominationFormNo(String nominationFormNo) {
		this.nominationFormNo = nominationFormNo;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public float getSecurityDeposit() {
		return securityDeposit;
	}

	public void setSecurityDeposit(float securityDeposit) {
		this.securityDeposit = securityDeposit;
	}

	public boolean isOathOrAffirmationSummited() {
		return oathOrAffirmationSummited;
	}

	public void setOathOrAffirmationSummited(boolean oathOrAffirmationSummited) {
		this.oathOrAffirmationSummited = oathOrAffirmationSummited;
	}

	public boolean isPoliceVerificationDone() {
		return policeVerificationDone;
	}

	public void setPoliceVerificationDone(boolean policeVerificationDone) {
		this.policeVerificationDone = policeVerificationDone;
	}

	public boolean isApprovedByElectionOfficer() {
		return approvedByElectionOfficer;
	}

	public void setApprovedByElectionOfficer(boolean approvedByElectionOfficer) {
		this.approvedByElectionOfficer = approvedByElectionOfficer;
	}

	public RegisteredSocietyVoters getRegisteredSocietyVoter() {
		return registeredSocietyVoter;
	}

	public void setRegisteredSocietyVoter(RegisteredSocietyVoters registeredSocietyVoter) {
		this.registeredSocietyVoter = registeredSocietyVoter;
	}

	
	public ElectionResult getElectionResult() {
		return electionResult;
	}

	public void setElectionResult(ElectionResult electionResult) {
		this.electionResult = electionResult;
	}



	@Override
	public String toString() {
		return "NominatedCandidates [candidateId=" + candidateId + ", nominationFormNo=" + nominationFormNo
				+ ", partyName=" + partyName + ", symbol=" + symbol + ", securityDeposit=" + securityDeposit
				+ ", oathOrAffirmationSummited=" + oathOrAffirmationSummited + ", policeVerificationDone="
				+ policeVerificationDone + ", approvedByElectionOfficer=" + approvedByElectionOfficer
				+ ", registeredSocietyVoter=" + registeredSocietyVoter + ", votedList=" + votedList
				+ ", electionResult=" + electionResult + "]";
	}

	
	
	
    
    
    
  
}
