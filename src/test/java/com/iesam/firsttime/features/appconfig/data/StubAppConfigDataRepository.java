package com.iesam.firsttime.features.appconfig.data;

import com.iesam.firsttime.features.appconfig.domain.AppConfig;
import com.iesam.firsttime.features.appconfig.domain.AppConfigRepository;

public class StubAppConfigDataRepository implements AppConfigRepository {
    @Override
    public AppConfig getAppConfig() {
        return StubFactory.buildAppConfig();
    }

    @Override
    public void saveAppConfig(AppConfig appConfig) {

    }
}
