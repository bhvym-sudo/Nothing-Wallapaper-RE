.class public final synthetic Lo7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:Lo7/g;


# direct methods
.method public synthetic constructor <init>(Lo7/g;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo7/e;->q:Lo7/g;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, Lo7/e;->q:Lo7/g;

    invoke-static {p0}, Lo7/g;->y(Lo7/g;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
