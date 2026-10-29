.class public final Lcom/nothing/wallpaper/picker/creative/network/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/picker/creative/network/a$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/nothing/wallpaper/picker/creative/network/a$a;


# instance fields
.field private a:Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi;

.field private b:Z


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/wallpaper/picker/creative/network/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/picker/creative/network/a$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/wallpaper/picker/creative/network/a;->c:Lcom/nothing/wallpaper/picker/creative/network/a$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/nothing/wallpaper/picker/creative/network/a;->b:Z

    sget-object v1, Li6/l;->a:Li6/l;

    invoke-virtual {v1, p1, v0}, Li6/l;->c(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object v0

    sget-object v1, LY6/c;->a:LY6/c;

    invoke-virtual {v1, p1}, LY6/c;->a(Landroid/content/Context;)LP8/z;

    move-result-object p1

    new-instance v1, Lg9/y$b;

    invoke-direct {v1}, Lg9/y$b;-><init>()V

    invoke-virtual {v1, v0}, Lg9/y$b;->c(Ljava/lang/String;)Lg9/y$b;

    move-result-object v0

    invoke-static {}, Lh9/a;->f()Lh9/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg9/y$b;->a(Lg9/h$a;)Lg9/y$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg9/y$b;->e(LP8/e$a;)Lg9/y$b;

    move-result-object p1

    invoke-virtual {p1}, Lg9/y$b;->d()Lg9/y;

    move-result-object p1

    const-class v0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi;

    invoke-virtual {p1, v0}, Lg9/y;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi;

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/creative/network/a;->a:Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi;

    return-void
.end method

.method private final a(Landroid/content/Context;Ljava/lang/String;)I
    .registers 7

    const-string v0, "prompts_release_environment"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Li6/n;->a(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    const-string v2, "prompts_language"

    const-string v3, ""

    invoke-static {p1, v2, v3}, Li6/n;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    const-string v2, "prompts_version"

    if-eqz p2, :cond_20

    iget-boolean p0, p0, Lcom/nothing/wallpaper/picker/creative/network/a;->b:Z

    if-ne p0, v0, :cond_20

    invoke-static {p1, v2, v1}, Li6/n;->b(Landroid/content/Context;Ljava/lang/String;I)I

    move-result p0

    return p0

    :cond_20
    invoke-static {p1, v2, v1}, Li6/n;->g(Landroid/content/Context;Ljava/lang/String;I)V

    return v1
.end method

.method private final e(Landroid/content/Context;ILjava/lang/String;)V
    .registers 5

    const-string v0, "prompts_language"

    invoke-static {p1, v0, p3}, Li6/n;->i(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    const-string p3, "prompts_version"

    invoke-static {p1, p3, p2}, Li6/n;->g(Landroid/content/Context;Ljava/lang/String;I)V

    const-string p2, "prompts_release_environment"

    iget-boolean p0, p0, Lcom/nothing/wallpaper/picker/creative/network/a;->b:Z

    invoke-static {p1, p2, p0}, Li6/n;->f(Landroid/content/Context;Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final b(Landroid/content/Context;Ljava/lang/String;)Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;
    .registers 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "language"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;

    invoke-direct {p0, p1, p2}, Lcom/nothing/wallpaper/picker/creative/network/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    sget-object v2, Li6/e;->a:Li6/e;

    invoke-virtual {v2}, Li6/e;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Li6/e;->e()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, p2, v1, v3, v2}, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/creative/network/a;->a:Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi;

    invoke-interface {v1, v0}, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi;->b(Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$DeviceParam;)Lg9/d;

    move-result-object v0

    invoke-interface {v0}, Lg9/d;->a()Lg9/x;

    move-result-object v0

    invoke-virtual {v0}, Lg9/x;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nothing/wallpaper/picker/creative/network/ResponseData;

    if-eqz v0, :cond_36

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/creative/network/ResponseData;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;

    goto :goto_37

    :cond_36
    const/4 v0, 0x0

    :goto_37
    if-eqz v0, :cond_4f

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->getPromptSets()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    if-eqz v1, :cond_4f

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_48

    goto :goto_4f

    :cond_48
    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/creative/network/entity/PromptResponse;->getVersion()I

    move-result v1

    invoke-direct {p0, p1, v1, p2}, Lcom/nothing/wallpaper/picker/creative/network/a;->e(Landroid/content/Context;ILjava/lang/String;)V

    :cond_4f
    :goto_4f
    return-object v0
.end method

.method public final c(Ljava/lang/String;Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;I)Lcom/nothing/wallpaper/picker/creative/network/entity/WallpaperResponse;
    .registers 9

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subjectPrompt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stylePrompt"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;

    invoke-virtual {p2}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide v1

    const-string v3, "subject"

    invoke-virtual {p2}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordEn()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    new-instance p2, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;

    invoke-virtual {p3}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide v1

    const-string v3, "style"

    invoke-virtual {p3}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordEn()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, v1, v2, v3, p3}, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    new-instance p3, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;

    filled-new-array {v0, p2}, [Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$PromptParam;

    move-result-object p2

    invoke-static {p2}, Li8/s;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-direct {p3, p1, p4, p2}, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;-><init>(Ljava/lang/String;ILjava/util/List;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/a;->a:Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi;

    invoke-interface {p0, p3}, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi;->c(Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperParam;)Lg9/d;

    move-result-object p0

    invoke-interface {p0}, Lg9/d;->a()Lg9/x;

    move-result-object p0

    invoke-virtual {p0}, Lg9/x;->a()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/creative/network/ResponseData;

    if-eqz p0, :cond_53

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/creative/network/ResponseData;->getData()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/creative/network/entity/WallpaperResponse;

    return-object p0

    :cond_53
    const/4 p0, 0x0

    return-object p0
.end method

.method public final d(Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;)I
    .registers 6

    const-string v0, "subjectPrompt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stylePrompt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide v1

    invoke-virtual {p2}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide p1

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;-><init>(JJ)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/creative/network/a;->a:Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi;

    invoke-interface {p0, v0}, Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi;->a(Lcom/nothing/wallpaper/picker/creative/network/WallpaperApi$WallpaperCountParam;)Lg9/d;

    move-result-object p0

    invoke-interface {p0}, Lg9/d;->a()Lg9/x;

    move-result-object p0

    invoke-virtual {p0}, Lg9/x;->a()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/creative/network/ResponseData;

    if-eqz p0, :cond_36

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/creative/network/ResponseData;->getData()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    if-eqz p0, :cond_36

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_36
    const/4 p0, 0x0

    return p0
.end method
