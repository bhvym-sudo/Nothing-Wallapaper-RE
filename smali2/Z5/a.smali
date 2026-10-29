.class public abstract LZ5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/util/ArrayList;

.field private static b:Ljava/util/ArrayList;

.field private static c:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .registers 25

    new-instance v0, Ljava/util/ArrayList;

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    sget-object v22, Ljava/util/Locale;->FRANCE:Ljava/util/Locale;

    invoke-virtual/range {v22 .. v22}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v3

    sget-object v23, Ljava/util/Locale;->GERMAN:Ljava/util/Locale;

    invoke-virtual/range {v23 .. v23}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v4

    sget-object v24, Ljava/util/Locale;->ITALIAN:Ljava/util/Locale;

    invoke-virtual/range {v24 .. v24}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v5

    const-string v20, "mk"

    const-string v21, "pt"

    const-string v6, "af"

    const-string v7, "da"

    const-string v8, "es"

    const-string v9, "et"

    const-string v10, "fi"

    const-string v11, "tl"

    const-string v12, "nb"

    const-string v13, "sv"

    const-string v14, "nl"

    const-string v15, "ru"

    const-string v16, "uk"

    const-string v17, "bg"

    const-string v18, "sr"

    const-string v19, "be"

    filled-new-array/range {v2 .. v21}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    sput-object v0, LZ5/a;->a:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {v22 .. v22}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v23 .. v23}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {v24 .. v24}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v5

    const-string v20, "mk"

    const-string v21, "pt"

    const-string v6, "af"

    const-string v7, "da"

    const-string v8, "es"

    const-string v9, "et"

    const-string v10, "fi"

    const-string v11, "tl"

    const-string v12, "nb"

    const-string v13, "sv"

    const-string v14, "nl"

    const-string v15, "ru"

    const-string v16, "uk"

    const-string v17, "bg"

    const-string v18, "sr"

    const-string v19, "be"

    filled-new-array/range {v2 .. v21}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    sput-object v0, LZ5/a;->b:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    const-string v1, "ko"

    const-string v2, "ru"

    const-string v3, "zh"

    const-string v4, "ja"

    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    sput-object v0, LZ5/a;->c:Ljava/util/ArrayList;

    return-void
.end method

.method public static a(Ljava/lang/String;)Z
    .registers 4

    :try_start_0
    const-string v0, "com.nothing.utils.Utils"

    invoke-static {v0}, Lb6/b;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "isSupportNdot"

    const-class v2, Ljava/lang/String;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lb6/g;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_2e

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lb6/g;->b(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_23} :catch_24

    return p0

    :catch_24
    move-exception v0

    const-string v1, "NothingUtils"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2e
    sget-object v0, LZ5/a;->a:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/Locale;

    invoke-direct {v1, p0}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_41

    const/4 p0, 0x1

    return p0

    :cond_41
    const/4 p0, 0x0

    return p0
.end method
