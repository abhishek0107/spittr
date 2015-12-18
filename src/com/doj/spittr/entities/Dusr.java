/**
 * 
 */
package com.doj.spittr.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Dinesh.Rajput
 *
 */

@Entity
@Table(name = "DUSR")
public class Dusr implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5371904985264645153L;

	@Id
	@GeneratedValue
	private Long usrid;

	private String usrfn;
	private String usrln;
	private String usreml;
	private String usrpwd;
	public String getUsrpwd() {
		return usrpwd;
	}

	public void setUsrpwd(String usrpwd) {
		this.usrpwd = usrpwd;
	}

	private Date usrdob;
	private String usrphn;
	private String usraddr1;
	private String usraddr2;
	private Long usrcity;
	private Long usrstate;
	private Date createdate;
	private Date modidate;
	private Long photoid;
	private String exfield1;
	private Long exfield2;
	private String isdeleted;
	private String active;

	public Long getUsrid() {
		return usrid;
	}

	public void setUsrid(Long usrid) {
		this.usrid = usrid;
	}

	public String getUsrfn() {
		return usrfn;
	}

	public void setUsrfn(String usrfn) {
		this.usrfn = usrfn;
	}

	public String getUsrln() {
		return usrln;
	}

	public void setUsrln(String usrln) {
		this.usrln = usrln;
	}

	public String getUsreml() {
		return usreml;
	}

	public void setUsreml(String usreml) {
		this.usreml = usreml;
	}

	public Date getUsrdob() {
		return usrdob;
	}

	public void setUsrdob(Date usrdob) {
		this.usrdob = usrdob;
	}

	public String getUsrphn() {
		return usrphn;
	}

	public void setUsrphn(String usrphn) {
		this.usrphn = usrphn;
	}

	public String getUsraddr1() {
		return usraddr1;
	}

	public void setUsraddr1(String usraddr1) {
		this.usraddr1 = usraddr1;
	}

	public String getUsraddr2() {
		return usraddr2;
	}

	public void setUsraddr2(String usraddr2) {
		this.usraddr2 = usraddr2;
	}

	public Long getUsrcity() {
		return usrcity;
	}

	public void setUsrcity(Long usrcity) {
		this.usrcity = usrcity;
	}

	public Long getUsrstate() {
		return usrstate;
	}

	public void setUsrstate(Long usrstate) {
		this.usrstate = usrstate;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public Date getModidate() {
		return modidate;
	}

	public void setModidate(Date modidate) {
		this.modidate = modidate;
	}

	public Long getPhotoid() {
		return photoid;
	}

	public void setPhotoid(Long photoid) {
		this.photoid = photoid;
	}

	public String getExfield1() {
		return exfield1;
	}

	public void setExfield1(String exfield1) {
		this.exfield1 = exfield1;
	}

	public Long getExfield2() {
		return exfield2;
	}

	public void setExfield2(Long exfield2) {
		this.exfield2 = exfield2;
	}

	public String getIsdeleted() {
		return isdeleted;
	}

	public void setIsdeleted(String isdeleted) {
		this.isdeleted = isdeleted;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public Dusr() {
		super();
	}

	public Dusr(Long usrid, String usrfn, String usrln, String usreml, Date usrdob, String usrphn, String usraddr1,
			String usraddr2, Long usrcity, Long usrstate, Date createdate, Date modidate, Long photoid, String exfield1,
			Long exfield2, String isdeleted, String active) {
		super();
		this.usrid = usrid;
		this.usrfn = usrfn;
		this.usrln = usrln;
		this.usreml = usreml;
		this.usrdob = usrdob;
		this.usrphn = usrphn;
		this.usraddr1 = usraddr1;
		this.usraddr2 = usraddr2;
		this.usrcity = usrcity;
		this.usrstate = usrstate;
		this.createdate = createdate;
		this.modidate = modidate;
		this.photoid = photoid;
		this.exfield1 = exfield1;
		this.exfield2 = exfield2;
		this.isdeleted = isdeleted;
		this.active = active;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((active == null) ? 0 : active.hashCode());
		result = prime * result + ((createdate == null) ? 0 : createdate.hashCode());
		result = prime * result + ((exfield1 == null) ? 0 : exfield1.hashCode());
		result = prime * result + ((exfield2 == null) ? 0 : exfield2.hashCode());
		result = prime * result + ((isdeleted == null) ? 0 : isdeleted.hashCode());
		result = prime * result + ((modidate == null) ? 0 : modidate.hashCode());
		result = prime * result + ((photoid == null) ? 0 : photoid.hashCode());
		result = prime * result + ((usraddr1 == null) ? 0 : usraddr1.hashCode());
		result = prime * result + ((usraddr2 == null) ? 0 : usraddr2.hashCode());
		result = prime * result + ((usrcity == null) ? 0 : usrcity.hashCode());
		result = prime * result + ((usrdob == null) ? 0 : usrdob.hashCode());
		result = prime * result + ((usreml == null) ? 0 : usreml.hashCode());
		result = prime * result + ((usrfn == null) ? 0 : usrfn.hashCode());
		result = prime * result + ((usrid == null) ? 0 : usrid.hashCode());
		result = prime * result + ((usrln == null) ? 0 : usrln.hashCode());
		result = prime * result + ((usrphn == null) ? 0 : usrphn.hashCode());
		result = prime * result + ((usrpwd == null) ? 0 : usrpwd.hashCode());
		result = prime * result + ((usrstate == null) ? 0 : usrstate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dusr other = (Dusr) obj;
		if (active == null) {
			if (other.active != null)
				return false;
		} else if (!active.equals(other.active))
			return false;
		if (createdate == null) {
			if (other.createdate != null)
				return false;
		} else if (!createdate.equals(other.createdate))
			return false;
		if (exfield1 == null) {
			if (other.exfield1 != null)
				return false;
		} else if (!exfield1.equals(other.exfield1))
			return false;
		if (exfield2 == null) {
			if (other.exfield2 != null)
				return false;
		} else if (!exfield2.equals(other.exfield2))
			return false;
		if (isdeleted == null) {
			if (other.isdeleted != null)
				return false;
		} else if (!isdeleted.equals(other.isdeleted))
			return false;
		if (modidate == null) {
			if (other.modidate != null)
				return false;
		} else if (!modidate.equals(other.modidate))
			return false;
		if (photoid == null) {
			if (other.photoid != null)
				return false;
		} else if (!photoid.equals(other.photoid))
			return false;
		if (usraddr1 == null) {
			if (other.usraddr1 != null)
				return false;
		} else if (!usraddr1.equals(other.usraddr1))
			return false;
		if (usraddr2 == null) {
			if (other.usraddr2 != null)
				return false;
		} else if (!usraddr2.equals(other.usraddr2))
			return false;
		if (usrcity == null) {
			if (other.usrcity != null)
				return false;
		} else if (!usrcity.equals(other.usrcity))
			return false;
		if (usrdob == null) {
			if (other.usrdob != null)
				return false;
		} else if (!usrdob.equals(other.usrdob))
			return false;
		if (usreml == null) {
			if (other.usreml != null)
				return false;
		} else if (!usreml.equals(other.usreml))
			return false;
		if (usrfn == null) {
			if (other.usrfn != null)
				return false;
		} else if (!usrfn.equals(other.usrfn))
			return false;
		if (usrid == null) {
			if (other.usrid != null)
				return false;
		} else if (!usrid.equals(other.usrid))
			return false;
		if (usrln == null) {
			if (other.usrln != null)
				return false;
		} else if (!usrln.equals(other.usrln))
			return false;
		if (usrphn == null) {
			if (other.usrphn != null)
				return false;
		} else if (!usrphn.equals(other.usrphn))
			return false;
		if (usrpwd == null) {
			if (other.usrpwd != null)
				return false;
		} else if (!usrpwd.equals(other.usrpwd))
			return false;
		if (usrstate == null) {
			if (other.usrstate != null)
				return false;
		} else if (!usrstate.equals(other.usrstate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dusr [usrid=" + usrid + ", usrfn=" + usrfn + ", usrln=" + usrln + ", usreml=" + usreml + ", usrpwd="
				+ usrpwd + ", usrdob=" + usrdob + ", usrphn=" + usrphn + ", usraddr1=" + usraddr1 + ", usraddr2="
				+ usraddr2 + ", usrcity=" + usrcity + ", usrstate=" + usrstate + ", createdate=" + createdate
				+ ", modidate=" + modidate + ", photoid=" + photoid + ", exfield1=" + exfield1 + ", exfield2="
				+ exfield2 + ", isdeleted=" + isdeleted + ", active=" + active + "]";
	}

}
