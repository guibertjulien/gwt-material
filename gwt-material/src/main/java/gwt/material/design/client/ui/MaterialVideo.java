/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2017 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.client.ui;

import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.Frame;
import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.constants.CssName;

//@formatter:off

/**
 * Material Video get any youtube url that will inherit responsive design
 *
 * <p>
 * <p>
 * <h3>UiBinder Usage:</h3>
 * <pre>
 * {@code
 *     <m:MaterialVideo url="someurl" />
 * }
 * </pre>
 * </p>
 *
 * @author kevzlou7979
 * @author Ben Dol
 *
 * @see <a href="http://gwtmaterialdesign.github.io/gwt-material-demo/#media">Material Video</a>
 */
//@formatter:on
public class MaterialVideo extends MaterialWidget {

    private Frame frame = new Frame();

    public MaterialVideo() {
        super(Document.get().createDivElement(), CssName.VIDEO_CONTAINER);

        build();
    }

    @Override
    protected void build() {
        add(frame);
    }

    public MaterialVideo(String url) {
        this();
        setUrl(url);
    }

    public String getUrl() {
        return frame.getUrl();
    }

    public void setUrl(String url) {
        frame.setUrl(url);
        this.add(frame);
    }

    /**
     * @param fullscreen the fullscreen to set.
     */
    public void setFullscreen(boolean fullscreen) {
        frame.getElement().setAttribute("allowfullscreen", String.valueOf(fullscreen));
    }
}
