package com.aic.paas.task.rest.dep;

import java.util.List;

import com.aic.paas.task.bean.dep.PcAppVersion;

public interface PcAppVersionSvc {
	public static enum VersionStatus {
		UNDEPLOY(1), RUNNING(2), STOP(3);

		private int value;

		private VersionStatus(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

	}

	public List<PcAppVersion> getAppVersion(Long appId, int status);

	public Long getRunningAppVersionId(Long appId);

	public Long getStopedAppVersionId(Long appId);

	public void updateAppVersionStatus(Long appId, String version, int status);
}
