/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MB.model;

/**
 *
 * @author Linhlee
 */
public class SlideModel {
    private int slideId;
    private String urlSlide;
    private int priority;
    private int status;

    public SlideModel() {
    }

    public SlideModel(int slideId, String urlSlide, int priority, int status) {
        this.slideId = slideId;
        this.urlSlide = urlSlide;
        this.priority = priority;
        this.status = status;
    }

    public int getSlideId() {
        return slideId;
    }

    public void setSlideId(int slideId) {
        this.slideId = slideId;
    }

    public String getUrlSlide() {
        return urlSlide;
    }

    public void setUrlSlide(String urlSlide) {
        this.urlSlide = urlSlide;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
}
