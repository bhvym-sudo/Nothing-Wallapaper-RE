.class public final synthetic LP6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:Lg3/v;


# direct methods
.method public synthetic constructor <init>(Lg3/v;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP6/c;->q:Lg3/v;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    iget-object p0, p0, LP6/c;->q:Lg3/v;

    check-cast p1, Landroid/app/WallpaperColors;

    invoke-static {p0, p1}, LP6/a$c;->f(Lg3/v;Landroid/app/WallpaperColors;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
