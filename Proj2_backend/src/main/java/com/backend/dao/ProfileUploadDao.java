package com.backend.dao;

import com.backend.model.ProfilePicture;

public interface ProfileUploadDao {
void save(ProfilePicture profilePicture);
ProfilePicture getProfilePic(String username);
}