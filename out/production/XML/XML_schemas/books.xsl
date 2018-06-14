<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" />
    <xsl:template match="/">
        <html>
            <head>
                <title>Literature</title>
            </head>
            <body>
                <!-- system info -->
                XML information: <br />
                Version: <xsl:value-of select="system-property('xsl:version')" /><br/>
                Vendor: <xsl:value-of select="system-property('xsl:vendor')" /><br/>
                Vendor URL: <xsl:value-of select="system-property('xsl:vendor-url')" /><br/>
                ------------------------------------- <br />

                <!-- print anchor links with respective value-of(name) -->
                <xsl:for-each select="course/book">
                    <a href="#{generate-id(name)}"> <xsl:value-of select="name" /> </a><br />
                </xsl:for-each>

                <!-- sort elements by ascending name & print them along with info + image -->
                <xsl:for-each select="course/book">
                    <xsl:sort select="name" order="ascending" data-type="text" />
                    <h3>
                        <a name="{generate-id(name)}"> <xsl:value-of select="name" /> </a>
                    </h3>

                    <!-- image -->
                    <img>
                        <xsl:attribute name="src">
                            <!-- set value for attribute -->
                            <xsl:value-of select="image/@href" />
                        </xsl:attribute>
                    </img>

                    <!-- returns current node information
                    <xsl:value-of select="current()" />
                    -->
                    <p>
                        <xsl:value-of select="name" /> was released in <xsl:value-of select="year" /> by <xsl:value-of
                            select="author" />. It's been read by a lot of people. You should read it too.<br />
                        ISBN: <xsl:value-of select="isbn" /> <br />
                    </p>
                </xsl:for-each>

                <!-- output information in a table -->
                <table border="1">
                    <tr>
                        <th>Name</th> <th>Year</th> <th>Author</th> <th>ISBN</th>
                    </tr>

                    <!-- check if year element is greater than <number> and print information -->
                    <xsl:for-each select="course/book">
                        <xsl:if test="year &gt; 2006" >
                            <tr>
                                <td><xsl:value-of select="name" /></td>
                                <td><xsl:value-of select="year" /></td>
                                <td><xsl:value-of select="author" /></td>
                                <td><xsl:value-of select="isbn" /></td>
                            </tr>
                        </xsl:if>
                    </xsl:for-each>
                </table>

            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>