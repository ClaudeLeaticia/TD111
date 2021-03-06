package com.example.lea.lobby;

import com.example.lea.common.domain.interactors.LoadGreetingUseCase;

import javax.inject.Inject;

import io.reactivex.Single;

class LoadLobbyGreetingUseCase implements LoadGreetingUseCase {
    private final LobbyGreetingRepository greetingRepository;

    @Inject
    LoadLobbyGreetingUseCase(LobbyGreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public Single<String> execute() {
        return greetingRepository.getGreeting();
    }
}
