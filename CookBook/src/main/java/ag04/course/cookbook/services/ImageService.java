package ag04.course.cookbook.services;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {
    void saveImageFile(Long recipeId, MultipartFile file);
}
