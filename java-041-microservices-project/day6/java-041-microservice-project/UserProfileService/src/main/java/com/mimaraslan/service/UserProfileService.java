package com.mimaraslan.service;

import com.mimaraslan.dto.request.UserProfileSaveRequestDto;
import com.mimaraslan.mapper.IUserProfileMapper;
import com.mimaraslan.model.UserProfile;
import com.mimaraslan.rabbitmq.model.AuthSaveModel;
import com.mimaraslan.repository.IUserProfileRepository;
import org.springframework.stereotype.Service;


@Service
public class UserProfileService extends ServiceManager<UserProfile, Long> {

    private final IUserProfileRepository repository;

    public UserProfileService(IUserProfileRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public boolean save(UserProfileSaveRequestDto dto) {
        /*
        UserProfile userProfile = new UserProfile();
        userProfile.setAutId(dto.getAuthId());
        userProfile.setUsername(dto.getUsername());
        userProfile.setEmail(dto.getEmail());
        userProfile.setAddress(dto.getAddress());
        save(userProfile);
        */

        /*
        UserProfile userProfile = UserProfile.builder()
                .autId(dto.getAuthId())
                .username(dto.getUsername())
                .email(dto.getEmail())
                .address(dto.getAddress())
                .build();
        save(userProfile);
        */

        save(IUserProfileMapper.INSTANCE.toUserProfile(dto));
        return true;

    }

    public void saveRabbit(AuthSaveModel model) {
        save(IUserProfileMapper.INSTANCE.toUserProfile(model));
    }
}
