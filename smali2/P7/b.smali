.class public final LP7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LP7/b;

.field private static final b:Lh8/h;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LP7/b;

    invoke-direct {v0}, LP7/b;-><init>()V

    sput-object v0, LP7/b;->a:LP7/b;

    new-instance v0, LP7/a;

    invoke-direct {v0}, LP7/a;-><init>()V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    sput-object v0, LP7/b;->b:Lh8/h;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()LQ7/a;
    .registers 1

    invoke-static {}, LP7/b;->d()LQ7/a;

    move-result-object v0

    return-object v0
.end method

.method private final b()Lcom/nothing/wallpaper/segmenter/Segmenter;
    .registers 1

    sget-object p0, LP7/b;->b:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/segmenter/Segmenter;

    return-object p0
.end method

.method public static final c()Lcom/nothing/wallpaper/segmenter/Segmenter;
    .registers 1

    sget-object v0, LP7/b;->a:LP7/b;

    invoke-direct {v0}, LP7/b;->b()Lcom/nothing/wallpaper/segmenter/Segmenter;

    move-result-object v0

    return-object v0
.end method

.method private static final d()LQ7/a;
    .registers 2

    new-instance v0, LQ7/a;

    sget-object v1, Lcom/nothing/wallpaper/NTPickerApplication;->q:Lcom/nothing/wallpaper/NTPickerApplication$a;

    invoke-virtual {v1}, Lcom/nothing/wallpaper/NTPickerApplication$a;->a()Landroid/app/Application;

    move-result-object v1

    invoke-direct {v0, v1}, LQ7/a;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
