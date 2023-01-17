/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.capstone.components.baner__002d__article;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class baner__002d__article__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_articlebanner = null;
_global_articlebanner = renderContext.call("use", com.alchemy.capstone.core.models.BannerArticle.class.getName(), obj());
out.write("\n<div id=\"fh5co-title-box\"");
{
    String var_attrcontent0 = (("background-image: url(" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_articlebanner, "bannerImage"), "unsafe"))) + "); background-position: 50% 90.5px;");
    out.write(" style=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent0));
    out.write("\"");
}
out.write(" data-stellar-background-ratio=\"0.5\">\n    <div class=\"overlay\"></div>\n    <div class=\"page-title\">\n        <img src=\"/content/dam/capstone/images/person_1.jpg\" alt=\"Free HTML5 by FreeHTMl5.co\"/>\n        <span>");
{
    Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_articlebanner, "mainArticleDateStr"), "text");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</span>\n        <h2>");
{
    Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_articlebanner, "bannerText"), "text");
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</h2>\n    </div>\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

