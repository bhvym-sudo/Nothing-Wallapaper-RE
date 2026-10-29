.class public final synthetic Ll7/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Ll7/v;


# direct methods
.method public synthetic constructor <init>(Ll7/v;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll7/u;->q:Ll7/v;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    iget-object p0, p0, Ll7/u;->q:Ll7/v;

    invoke-static {p0}, Ll7/v;->q1(Ll7/v;)V

    return-void
.end method
