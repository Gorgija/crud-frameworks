package org.jugvale.crudframeworks.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Framework {
	@Id
    @GeneratedValue
	private int id;
	private double currentVersion;
	private String description;
	private Date lastReleaseDate;
	@NotNull
	private String name;
	// yeah, not normalized.
	private String creator;
	private String homePage;
	private String platform;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCurrentVersion() {
		return currentVersion;
	}

	public void setCurrentVersion(double currentVersion) {
		this.currentVersion = currentVersion;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getLastReleaseDate() {
		return lastReleaseDate;
	}

	public void setLastReleaseDate(Date lastReleaseDate) {
		this.lastReleaseDate = lastReleaseDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getHomePage() {
		return homePage;
	}

	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}

}
