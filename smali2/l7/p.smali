.class public final synthetic Ll7/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:Ll7/r;


# direct methods
.method public synthetic constructor <init>(Ll7/r;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll7/p;->q:Ll7/r;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, Ll7/p;->q:Ll7/r;

    invoke-static {p0}, Ll7/r;->r1(Ll7/r;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
