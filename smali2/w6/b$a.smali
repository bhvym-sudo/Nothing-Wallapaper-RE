.class public final Lw6/b$a;
.super Lw6/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/android/wallpaper/asset/a;


# direct methods
.method public constructor <init>(Lcom/android/wallpaper/asset/a;)V
    .registers 3

    const-string v0, "asset"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lw6/b;-><init>(Lkotlin/jvm/internal/h;)V

    iput-object p1, p0, Lw6/b$a;->a:Lcom/android/wallpaper/asset/a;

    return-void
.end method


# virtual methods
.method public final a()Lcom/android/wallpaper/asset/a;
    .registers 1

    iget-object p0, p0, Lw6/b$a;->a:Lcom/android/wallpaper/asset/a;

    return-object p0
.end method
