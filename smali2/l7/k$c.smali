.class public final Ll7/k$c;
.super Lb/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll7/k;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic d:Ll7/k;


# direct methods
.method constructor <init>(Ll7/k;)V
    .registers 2

    iput-object p1, p0, Ll7/k$c;->d:Ll7/k;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lb/u;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public d()V
    .registers 1

    iget-object p0, p0, Ll7/k$c;->d:Ll7/k;

    invoke-static {p0}, Ll7/k;->p0(Ll7/k;)V

    return-void
.end method
