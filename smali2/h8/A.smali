.class public final Lh8/A;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lh8/A;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lh8/A;

    invoke-direct {v0}, Lh8/A;-><init>()V

    sput-object v0, Lh8/A;->a:Lh8/A;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 1

    const-string p0, "kotlin.Unit"

    return-object p0
.end method
