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
import javax.persistence.Table;

@Entity
@Table(name = "Nominated_Candidates")
public class NominatedCandidates implements Serializable {
	
	private static final long serialVersionUID = 99L;
	@Id
	@Column(name = "candidate_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long candidateId;
	private String nominationFormNo;
	private RegisteredSocietyVoters societyVoter;
	private String partyName;
	private String symbol;
	private float securityDeposit;
    private boolean oathOrAffirmationSummited;
    private boolean policeVerificationDone;
    private boolean approvedByElectionOfficer;
	
    public NominatedCandidates() {
		super();
	}

	public NominatedCandidates(long candidateId, String nominationFormNo, RegisteredSocietyVoters society_Voter,
			String partyName, String symbol, float securityDeposit, boolean oathOrAffirmationSummited,
			boolean policeVerificationDone, boolean approvedByElectionOfficer) {
		super();
		this.candidateId = candidateId;
		this.nominationFormNo = nominationFormNo;
		this.societyVoter = society_Voter;
		this.partyName = partyName;
		this.symbol = symbol;
		this.securityDeposit = securityDeposit;
		this.oathOrAffirmationSummited = oathOrAffirmationSummited;
		this.policeVerificationDone = policeVerificationDone;
		this.approvedByElectionOfficer = approvedByElectionOfficer;
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

	public RegisteredSocietyVoters getSociety_Voter() {
		return societyVoter;
	}

	public void setSociety_Voter(RegisteredSocietyVoters society_Voter) {
		this.societyVoter = society_Voter;
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

	@Override
	public String toString() {
		return "NominatedCandidates [candidateId=" + candidateId + ", nominationFormNo=" + nominationFormNo
				+ ", society_Voter=" + societyVoter + ", partyName=" + partyName + ", symbol=" + symbol
				+ ", securityDeposit=" + securityDeposit + ", oathOrAffirmationSummited=" + oathOrAffirmationSummited
				+ ", policeVerificationDone=" + policeVerificationDone + ", approvedByElectionOfficer="
				+ approvedByElectionOfficer + "]";
	}
    
    
    
    
  
}
